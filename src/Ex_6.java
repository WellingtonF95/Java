import java.awt.*;
import javax.swing.*;


public class Ex_6 extends JFrame {

    JLabel jl_numero1, jl_numero2, jl_espaço;
    JTextField jtx_num1, jtx_num2;
    JTextArea jtxa_pares, jtxa_impares;
    JPanel jp_panel1, jp_panel_esquerda, jp_panel_direita;
    GridLayout grid;

    public Ex_6 (){

        createGUI();
        createEvent();

    }

    public void createGUI (){
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Números pares e impares");
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setLocationRelativeTo(null);//Inicializa o JFrame ao centro da tela


        this.jp_panel1 =  new JPanel();
        this.jp_panel1.setBackground(Color.BLUE);
        this.jp_panel1.setLayout(new FlowLayout());

            this.jl_numero1 = new JLabel();
            this.jl_numero1.setText("Primeiro Número:");
            this.jp_panel1.add(jl_numero1);

            this.jtx_num1 = new JTextField();
            this.jtx_num1.setPreferredSize(new Dimension(30,20));
            this.jp_panel1.add(jtx_num1);

            this.jl_numero2 = new JLabel();
            this.jl_numero2.setText("Segundo Número:");
            this.jp_panel1.add(jl_numero2);

            this.jtx_num2 = new JTextField();
            this.jtx_num2.setPreferredSize(new Dimension(30,20));
            this.jp_panel1.add(jtx_num2);


        this.getContentPane().add(jp_panel1,BorderLayout.NORTH);



    }

    public void createEvent (){

    }

    //********* MAIN ***********
    public static void main (String[] args){
        Ex_6 ex = new Ex_6();
        ex.setVisible(true);
    }


}
