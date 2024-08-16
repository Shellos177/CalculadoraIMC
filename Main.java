import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Calculadora de IMC");
        janela.setSize(305, 355);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel texto = new JLabel("Calcule seu índice de massa corporal!");
        texto.setBounds(30,20,250,20);

        JLabel tuto = new JLabel("Tabela de IMC");
        tuto.setBounds(130,140,250,20);

        JLabel val1 = new JLabel("menor que 16,9");
        val1.setBounds(15,170,250,20);

        JLabel val2 = new JLabel("17 a 18,4");
        val2.setBounds(15,190,250,20);

        JLabel val3 = new JLabel("18,5 a 24,9");
        val3.setBounds(15,210,250,20);

        JLabel val4 = new JLabel("25 a 29,9");
        val4.setBounds(15,230,250,20);

        JLabel val5 = new JLabel("30 a 34,9");
        val5.setBounds(15,250,250,20);

        JLabel val6 = new JLabel("35 a 40");
        val6.setBounds(15,270,250,20);

        JLabel val7 = new JLabel("maior que 40");
        val7.setBounds(15,290,250,20);

        JLabel desc1 = new JLabel(">>     Muito abaixo do peso");
        desc1.setBounds(130,170,250,20);

        JLabel desc2 = new JLabel(">>     Abaixo do peso");
        desc2.setBounds(130,190,250,20);

        JLabel desc3 = new JLabel(">>     Normal");
        desc3.setBounds(130,210,250,20);

        JLabel desc4 = new JLabel(">>     Acima do peso");
        desc4.setBounds(130,230,250,20);

        JLabel desc5 = new JLabel(">>     Obesidade I");
        desc5.setBounds(130,250,250,20);

        JLabel desc6 = new JLabel(">>     Obesidade II");
        desc6.setBounds(130,270,250,20);

        JLabel desc7 = new JLabel(">>     Obesidade III");
        desc7.setBounds(130,290,250,20);

        JLabel peso1 = new JLabel("Peso ");
        peso1.setBounds(15, 60,300,20);

        JLabel altura1 = new JLabel("Altura ");
        altura1.setBounds(15, 80,300,20);


        JTextField campoPeso = new JTextField();
        campoPeso.setBounds(53,60,100,19);

        JTextField campoAltura = new JTextField();
        campoAltura.setBounds(53,80,100,19);

        JButton botao = new JButton();
        botao.setBounds(160,70,100,19);
        botao.setText("Calcular!");
        botao.addActionListener(event ->{
            float peso = Float.parseFloat(campoPeso.getText());
            float altura = Float.parseFloat(campoAltura.getText());
            float imc = peso / (altura * altura);
            JFrame resultado = new JFrame();
            resultado.setSize(300,70);
            resultado.setTitle("IMC");

            JLabel resultado1 = new JLabel("Seu IMC É: " + imc);
            resultado1.setBounds(10,10,200,19);


            resultado.setLayout(null);
            resultado.getContentPane().add(resultado1);
            resultado.setVisible(true);
        });



        janela.setLayout(null);
        janela.getContentPane().add(botao);
        janela.getContentPane().add(campoAltura);
        janela.getContentPane().add(campoPeso);
        janela.getContentPane().add(peso1);
        janela.getContentPane().add(altura1);
        janela.getContentPane().add(texto);
        janela.getContentPane().add(tuto);
        janela.getContentPane().add(val1);
        janela.getContentPane().add(val2);
        janela.getContentPane().add(val3);
        janela.getContentPane().add(val4);
        janela.getContentPane().add(val5);
        janela.getContentPane().add(val6);
        janela.getContentPane().add(val7);
        janela.getContentPane().add(desc1);
        janela.getContentPane().add(desc2);
        janela.getContentPane().add(desc3);
        janela.getContentPane().add(desc4);
        janela.getContentPane().add(desc5);
        janela.getContentPane().add(desc6);
        janela.getContentPane().add(desc7);
        janela.setVisible(true);
    }
}