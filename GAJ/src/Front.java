import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Front extends JFrame{

	private String unidade= "d";
	
	private ImageIcon img = new ImageIcon(unidade+":/ProjetoGAJ/imgs/nome.jpg");
	private JLabel logo = new JLabel(img);
	
	private ImageIcon imgf = new ImageIcon(unidade+":/ProjetoGAJ/imgs/fundo.png");
	private JLabel logof = new JLabel(imgf);
	
	private ImageIcon imgu = new ImageIcon(unidade+":/ProjetoGAJ/imgs/photo.jpg");
	private JLabel logou = new JLabel(imgu);
	
	private JLabel use;
	private JLabel calendario;;
	
	
	private ImageIcon pre = new ImageIcon(unidade+":/ProjetoGAj/imgs/dese.png");
	private JLabel pre1;;

	
	/////IMAGENS DOS BOTOES DO PAINEL DE BOTEOS/////////////////////////
	  private JLabel ll = new JLabel("dsfs ");
	  
	    private ImageIcon img1 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/cli.png");
		
		private ImageIcon img2 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/add.png");
		
		private ImageIcon img3 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/pes.png");
		
		private ImageIcon img4 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/rec.png");
	
		private ImageIcon img5 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/pra.png");
			
		private ImageIcon img6 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/agen.png");
			
		private ImageIcon img7 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/pende.png");
			
		private ImageIcon img8 = new ImageIcon(unidade+":/ProjetoGAJ/imgs/disp.png");
		
	
		
		/// FALTA SETAR AS IMAGENS !!!!!!!!!!!!!!!!!!!!!!
		
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	
	public Front(){
		
		super("�rea de trabalho");
		
		
		logo.setVisible(true);
		logo.setBounds(0, 0, 1000, 183);
		
		logof.setVisible(true);
		logof.setBounds(0, 630, 1000, 180);
		
		logou.setVisible(true);
		logou.setBounds(25, 10, 80, 80);
		
		use = new JLabel("Usu�rio Logado!");
		use.setVisible(true);
		use.setBounds(21, 50, 120, 100);
		use.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		use.setForeground(Color.black);
		
		
		
		
	/////PAINEL P3 VISUALIZA��O////////////////////////////
		
		
		p3 =new JPanel();
		p3.setBackground(Color.GRAY);
		p3.setVisible(true);
		p3.setBounds(517, 190, 470, 500);
		p3.setLayout(null);
		
		
		pre1 = new JLabel(pre);
		pre1.setVisible(true);
		pre1.setBounds(10, 10, 450, 480);
		pre1.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
		pre1.setForeground(Color.black);
		
		p3.add(pre1);
		
		
		
		////PAINEL DE BOTOES/////////////////////////////////
		p1 =new JPanel();
		p1.setBackground(Color.GRAY);
		p1.setVisible(true);
		p1.setBounds(7, 320, 502, 370);
		p1.setLayout(null);
		
		 JButton bta = new JButton(img1);
			bta.setVisible(true);
			bta.setBounds(30, 50, 180, 30);
			
			
			 JButton btb = new JButton(img2);
				btb.setVisible(true);
				btb.setBounds(30, 130, 180, 30);
				
				
				 JButton btc = new JButton(img3);
					btc.setVisible(true);
                    btc.setBounds(30, 210, 180, 30);
                    
               	  JButton btd = new JButton(img4);
               		 btd.setVisible(true);
               		 btd.setBounds(30, 290, 180, 30);
         		
                    
                    
               		 JButton bte = new JButton(img5);
         			bte.setVisible(true);
         			bte.setBounds(290, 50, 180, 30);
         	 
         			 JButton btf = new JButton(img6);
         				btf.setVisible(true);
         				btf.setBounds(290, 130, 180, 30);
         				
         				
         				 JButton btg = new JButton(img7);
         					btg.setVisible(true);
                             btg.setBounds(290, 210, 180, 30);
                             
                        	  JButton bth = new JButton(img8);
                        		 bth.setVisible(true);
                        		 bth.setBounds(290, 290, 180, 30);
                  		
                                        
		
		p1.add(btb);
		p1.add(btc);
		p1.add(btd);
		p1.add(bta);
		p1.add(bte);
		p1.add(btf);
		p1.add(btg);
		p1.add(bth);
		
		
		
		////FIM//////////////////////////////////////////////
		
		
		
		
		///PAINEL DE USU�RIO E SEUS ELEMENTOS////////////////
		
		
		p2 =new JPanel();
		p2.setBackground(Color.GRAY);
		p2.setVisible(true);
		p2.setBounds(7, 190, 502, 120);
		p2.setLayout(null);
		
		calendario = new JLabel("Jo�o Pessoa PB 23/08/2017");
		calendario.setVisible(true);
		calendario.setBounds(245, -20, 200, 100);
		calendario.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
		calendario.setForeground(Color.black);
		
		 ImageIcon imgg = new ImageIcon(unidade+":/ProjetoGAJ/imgs/perf.png");
		 JButton bt = new JButton(imgg);
		bt.setVisible(true);
		bt.setBounds(150, 80, 180, 25);
		
		
		 ImageIcon imga = new ImageIcon(unidade+":/ProjetoGAJ/imgs/sair.png");
		 JButton bt1 = new JButton(imga);
		bt1.setVisible(true);
		bt1.setBounds(340, 80, 150, 25);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		p2.add(calendario);
		p2.add(logou);
		p2.add(use);
		p2.add(bt);
		p2.add(bt1);
		
		
		////FIM///////////////////////////////////////////////
		
		
		
		
		
		
		
		
	
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setBounds(300,170, 1000, 770);
		super.setLayout(null);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		
		
		
		
		super.add(logof);
		super.add(logo);
		super.add(p1);
		super.add(p2);
		super.add(p3);
		
		
		
		
	}
	
	public static void main(String [] args) {
		
		//Front f = new Front();
		
	}
	
	
	
	
}
