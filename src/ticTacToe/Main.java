//package ticTacToe;
//
//import com.sun.jdi.connect.Transport;
//
//import javax.mail.Message;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
//import java.util.Properties;
//import java.util.Scanner;
//
//public class Main {
//    public static <Session> void main(String[] args) {
//        // Foydalanuvchidan elektron manzilni olish
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Iltimos, elektron manzilingizni kiriting: ");
//        String toEmail = scanner.next();
//
//        // Gonderuvchi va parolni o'zgartiring
//        final String fromEmail = "sender_email@example.com"; // o'zingizning elektron manzilingizni yozing
//        final String password = "password"; // o'zingizning parolni yozing
//
//        System.out.println("Taqiqlangan a'mallar yuzaga kelmoqda, iltimos kuting...");
//
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com"); // Gmail SMTP Server manzili
//        props.put("mail.smtp.port", "587"); // TLS uyali port raqami
//        props.put("mail.smtp.auth", "true"); // Foydalanuvchi tasdiqlash
//
//        // Parolni tasdiqlashchi
//        Authenticator auth = new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromEmail, password.toCharArray());
//            }
//        };
//
//        // Sesni boshlash
//        Session session = Session.getInstance(props, auth);
//
//
//        try {
//            // Yangi xabar yaratish
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(fromEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//            message.setSubject("Salom");
//            message.setText("Assalomu alaykum!\n\n Bu yangi dastur orqali xabar jo'natishni sinab ko'rishni xohlaysizmi?");
//
//            // Xabarni yuborish
//            Transport.send(message);
//
//            System.out.println("Xabar muvaffaqiyatli jo'natildi!");
//        } catch (Exception e) {
//            System.out.println("Xatolik yuz berdi: " + e.getMessage());
//        }
//    }
//}
//
