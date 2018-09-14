package V0_1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.Border;
public class window {
	public void setwindow(){
	final JFrame window = new JFrame("WebBrowser");
	//window.setLayout(new BorderLayout());
	Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	//ʹ����λ������
	JMenuBar jmb = new JMenuBar();
	Font font1=new Font("����",Font.BOLD,24);//�˵�������
	Font font2=new Font("΢���ź�",Font.BOLD,18);//�Ӳ˵�������
	JScrollPane scroolpane = new JScrollPane();
	//���ò˵���
	JMenu filemenu = new JMenu("�ļ�(F)");
	JMenu editmenu = new JMenu("�༭(E)");
	JMenu viewmenu = new JMenu("��ͼ(V)");
	filemenu.setFont(font1);
	editmenu.setFont(font1);
	viewmenu.setFont(font1);
	//JMenuBar menubar = new JMenuBar();
	//�����Ӳ˵���
	JMenuItem saveAsItem = new JMenuItem("���Ϊ(A)");
	JMenuItem exititem = new JMenuItem("�˳�(I)");
	JMenuItem forwarditem = new JMenuItem("ǰ��--->");
	JMenuItem backitem = new JMenuItem("����<---");
	JMenuItem fullscreenitem = new JMenuItem("ȫ��(U)");
	JMenuItem sourceitem = new JMenuItem("Դ����(C)");
	JMenuItem reloaditem = new JMenuItem("ˢ��(R)");
	saveAsItem.setFont(font2);
	exititem.setFont(font2);
	forwarditem.setFont(font2);
	backitem.setFont(font2);
	fullscreenitem.setFont(font2);
	sourceitem.setFont(font2);
	reloaditem.setFont(font2);
	filemenu.add(saveAsItem);
	filemenu.addSeparator();
	filemenu.add(exititem);
	//
	editmenu.add(forwarditem);
	editmenu.addSeparator();
	editmenu.add(backitem);
	//
	viewmenu.add(fullscreenitem);
	viewmenu.addSeparator();
	viewmenu.add(sourceitem);
	viewmenu.addSeparator();
	viewmenu.add(reloaditem);
	//
	jmb.add(filemenu);
	jmb.add(editmenu);
	jmb.add(viewmenu);
	window.setJMenuBar(jmb);
	//�������ǹ���������
	JToolBar toobar = new JToolBar();
	JButton saveasbtn = new JButton("���Ϊ");
	JButton backbtn = new JButton("<---");
	JButton forwardbtn = new JButton("--->");
	JButton sourcebtn = new JButton("Դ����");
	JButton exitbtn = new JButton("�˳�");
	toobar.add(saveasbtn);
	toobar.addSeparator();
	toobar.add(backbtn);
	toobar.addSeparator();
	toobar.add(forwardbtn);
	toobar.addSeparator();
	toobar.add(sourcebtn);
	toobar.addSeparator();
	toobar.add(exitbtn);
	//����
	JEditorPane editorpanel = new JEditorPane();
	JScrollPane scrollpanel = new JScrollPane(editorpanel);
	scrollpanel.setPreferredSize(new Dimension(100,630));
	//����box
	Box address = Box.createHorizontalBox();
	JTextField jurl = new JTextField(60);
	JLabel addresslab = new JLabel("��ַ��");
	address.setPreferredSize(new Dimension(1000, 70));
	JButton cometobtn = new JButton("ת��");
	address.add(addresslab);
	address.add(jurl);
	address.add(cometobtn);
	//���岼��
	JToolBar bar = new JToolBar();
	Container contentPane = window.getContentPane();
	contentPane.add(scrollpanel, BorderLayout.SOUTH);
	contentPane.add(toobar, BorderLayout.NORTH);
	contentPane.add(bar,BorderLayout.CENTER);
	//
	bar.add(address);
	int x = (int) screensize.getWidth() / 2 - window.getWidth() / 2;
	int y = (int) screensize.getHeight() / 2 - window.getHeight() / 2;
	window.setLocation(x - 500, y - 400);
	window.setSize(1000, 800);
	//ͼ������
	//ImageIcon icon = new ImageIcon("1.ico");
	//window.setIconImage(icon.getImage());
	//�˳���ť��������˳���ǰ����
	exititem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	//���ڹر�����
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	}

}
