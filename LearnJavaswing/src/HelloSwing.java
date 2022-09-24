import javax.swing.*;

public class HelloSwing {
    public HelloSwing(){
        JFrame frame = new JFrame("Hello"); //title frame
        frame.setSize(400,400); // set size frame chương trình
        frame.setVisible(true); // set ẩn hiện
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng chương trình jframe cũng đóng theo
       // frame.add(); add jframe khác
    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}
