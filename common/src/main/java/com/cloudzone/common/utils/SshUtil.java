package com.cloudzone.common.utils;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * @author yintongjiang
 * @params
 * @since 2018/3/20
 * SSH 链接工具
 */
public class SshUtil {
    private static final int SESSION_TIMEOUT = 30000;
    private static final int CHANNEL_TIMEOUT = 3000;


    public static class SshExecutor {
        private static Session session = null;

        private SshExecutor(SshInfo sshInfo) throws JSchException {
            JSch jsch = new JSch();
            session = jsch.getSession(sshInfo.getUser(), sshInfo.getHost(), sshInfo.getPort());
            session.setPassword(sshInfo.getPassword());
            session.setUserInfo(new MyUserInfo());
            session.connect(SESSION_TIMEOUT);
        }

        public String exec(String cmd) throws IOException, JSchException, InterruptedException {
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand(cmd);
            channelExec.setInputStream(null);
            channelExec.setErrStream(System.err);
            InputStream in = channelExec.getInputStream();
            channelExec.connect(CHANNEL_TIMEOUT);
            StringBuilder buf = new StringBuilder(1024);
            byte[] tmp = new byte[1024];
            while (true) {
                while (in.available() > 0) {
                    int i = in.read(tmp, 0, 1024);
                    if (i < 0) {
                        break;
                    }
                    buf.append(new String(tmp, 0, i));
                }
                if (channelExec.isClosed()) {
                    break;
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
            channelExec.disconnect();
            return buf.toString();
        }

        private Session getSession() {
            return session;
        }

        public void close() {
            getSession().disconnect();
        }
    }

    public static SshExecutor newInstance(String user, String password, String host, int port) throws JSchException {
        SshInfo sshInfo = new SshInfo(user, password, host, port);
        return new SshExecutor(sshInfo);
    }

/**
 * @author yintongqiang
 * @since 2018/3/20
 * @params 链接信息类
 */
    public static class SshInfo {
        private String user;
        private String password;
        private String host;
        private int port;

        private SshInfo(String user, String password, String host, int port) {
            this.user = user;
            this.password = password;
            this.host = host;
            this.port = port;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }

        public String getHost() {
            return host;
        }

        public int getPort() {
            return port;
        }
    }

    private static class MyUserInfo implements UserInfo {

        @Override
        public String getPassphrase() {
            return null;
        }

        @Override
        public String getPassword() {
            return null;
        }

        @Override
        public boolean promptPassword(String s) {
            return false;
        }

        @Override
        public boolean promptPassphrase(String s) {
            return false;
        }

        @Override
        public boolean promptYesNo(String s) {
            return true;
        }

        @Override
        public void showMessage(String s) {
        }
    }
}
