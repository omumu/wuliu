package com.wuliu.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by 木木高 on 2017/3/9.
 */
public class javamailUtil {

	public void sendmail(int cid, String mail, String url) {
		// 配置上传参数
		Properties prop = new Properties();
		// 初始化参数
		// 协议
		prop.put("mail.transport.protocol", "smtp");
		// 端口
		prop.put("mail.smtp.port", "25");
		// 主机
		prop.put("mail.smtp.host", "smtp.qq.com");
		// 认证

		// 调试prop.put("mail.smtp.auth", "true");
		prop.put("mail.debug", "true");
		prop.setProperty("mail.smtp.starttls.enable", "true");

		Session session = Session.getDefaultInstance(prop);
		Message message = new MimeMessage(session);
		// MimeMessageHelper messageHelper = new
		// MimeMessageHelper(mailMessage,true);
		// 标题
		try {
			message.setSubject("物流信息网密码找回");

			// 收件人
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail));
			message.setFrom(new InternetAddress("1219398062@qq.com", "超级物流小助手"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringBuffer sf1 = new StringBuffer();
		StringBuffer sf2 = new StringBuffer();
		sf1.append("<a href=\"" + url + "/user/user_update_pwd.jsp?Cid=");
		sf1.append(cid);
		sf1.append("\">");
		sf1.append("</a>");
		String[] str = sf1.toString().split("\"");
		sf2.append("物流信息网密码修改，30分钟内有效，否则重新验证，请尽快修改！");
		sf2.append(str[1]);
		System.out.println(sf2.toString());
		try {
			message.setText(sf2.toString());
			message.saveChanges();
			Transport t = session.getTransport();
			t.connect("1219398062@qq.com", "rghpqlfgpvdpiabe");
			/* t.connect("1219398062@qq.com","gaolin319"); */
			t.sendMessage(message, message.getAllRecipients());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
