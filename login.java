import java.awt.*;
import java.awt.Event.*;

class login {
    public static void main(String[] args) {
        Frame f= new Frame("lOGIN EXAMPLE");
        TextField tf= new TextField();
        tf.setBounds(50,50,150,20);
        TextField tf1= new TextField();
        tf.setBounds(50,150,150,20);
        TextField tf2= new TextField();
        tf.setBounds(50,250,150,20);
        Button login=new Button("Login");
        login.setBounds(50, 350, 150, 20);
        login.addActionListner(new ActionListner(){
        public void actionPerformed(ActionEvent e){
           String user= tf.getText().toString();
           String password= tf1.getText().toString();
           
           if (user="iust" && password="123")
           {
               setText.tf2("Valid user");
           }else
               setText.tf2("Invalid User");
           }
        });
		f.add(tf);f.add(tf1);f.add(tf2);f.add(login);
    }
}