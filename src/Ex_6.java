import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Ex_6 extends JFrame {

    /*Faça uma aplicação que receba dois números que formam um intervalo,
    encontre e mostre no area1 os números pares deste intervalo e no area2 os
    números ímpares. Caso não exista números pares ou ímpares mostrar
    mensagem.*/

    JLabel jl_numero1, jl_numero2, jl_titulo;
    JTextField jtx_num1, jtx_num2;
    JTextArea jtxa_pares, jtxa_impares;
    JPanel jp_panel1, jp_panel0, jp_panel2, jp_panel3;
    JButton jb_calcular;

    public Ex_6 (){

        createGUI();
        createEvent();

    }

    public void createGUI (){
        this.setSize(500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Números pares e impares");
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);//Inicializa o JFrame ao centro da tela

        this.jp_panel0 =  new JPanel();
        this.jp_panel0.setLayout(new BorderLayout());

            this.jl_titulo = new JLabel("ORDENAÇÃO DE NÚMEROS");
            this.jl_titulo.setLayout(new BorderLayout());
            this.jp_panel0.add(jl_titulo,BorderLayout.NORTH);

        this.jp_panel1 =  new JPanel();
        this.jp_panel1.setLayout(new FlowLayout());


            this.jl_numero1 = new JLabel();
            this.jl_numero1.setText("Primeiro Número:");
            this.jp_panel1.add(jl_numero1);

            this.jtx_num1 = new JTextField();
            this.jtx_num1.setPreferredSize(new Dimension(50,20));
            this.jp_panel1.add(jtx_num1);

            this.jl_numero2 = new JLabel();
            this.jl_numero2.setText("Segundo Número:");
            this.jp_panel1.add(jl_numero2);

            this.jtx_num2 = new JTextField();
            this.jtx_num2.setPreferredSize(new Dimension(50,20));
            this.jp_panel1.add(jtx_num2);

        this.jp_panel2 = new JPanel();
        this.jp_panel2.setLayout(new FlowLayout());

            this.jtxa_pares = new JTextArea();
            this.jtxa_pares.setPreferredSize(new Dimension(200,200));
            this.jp_panel2.add(jtxa_pares);

            this.jtxa_impares = new JTextArea();
            this.jtxa_impares.setPreferredSize(new Dimension(200,200));
            this.jp_panel2.add(jtxa_impares);

        this.jp_panel3 = new JPanel();
        this.jp_panel3.setLayout(new FlowLayout());

            this.jb_calcular = new JButton("Calcular");
            this.jb_calcular.setPreferredSize(new Dimension(100,50));
            this.jp_panel3.add(jb_calcular);



        this.getContentPane().add(jp_panel0);
        this.getContentPane().add(jp_panel1);
        this.getContentPane().add(jp_panel2);
        this.getContentPane().add(jp_panel3);



    }

    public void createEvent (){

        this.jb_calcular.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evento){
                short num1 = 0, num2 = 0;

                num1 = Short.parseShort(jtx_num1.getText());
                num2 = Short.parseShort(jtx_num2.getText());

                if (num1 == num2){
                    JOptionPane.showMessageDialog(null,"Não existe intervalo!");
                    jtx_num1.setText(null);
                    jtx_num2.setText(null);
                }else{
                    for (short i = num1; i <= num2; i++){
                        if(i % 2 == 0){
                            jtxa_pares.insert(" " + i + "\n",0);

                        }else{
                            jtxa_impares.insert(" " + i + "\n",0);
                        }
                    }
                }


            }
        });




    }

    //********* MAIN ***********
    public static void main (String[] args){
        Ex_6 ex = new Ex_6();
        ex.setVisible(true);
    }


}
