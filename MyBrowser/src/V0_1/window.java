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
	//使窗口位于中央
	JMenuBar jmb = new JMenuBar();
	Font font1=new Font("宋体",Font.BOLD,24);//菜单栏字体
	Font font2=new Font("微软雅黑",Font.BOLD,18);//子菜单栏字体
	JScrollPane scroolpane = new JScrollPane();
	//设置菜单栏
	JMenu filemenu = new JMenu("文件(F)");
	JMenu editmenu = new JMenu("编辑(E)");
	JMenu viewmenu = new JMenu("视图(V)");
	filemenu.setFont(font1);
	editmenu.setFont(font1);
	viewmenu.setFont(font1);
	//JMenuBar menubar = new JMenuBar();
	//设置子菜单栏
	JMenuItem saveAsItem = new JMenuItem("另存为(A)");
	JMenuItem exititem = new JMenuItem("退出(I)");
	JMenuItem forwarditem = new JMenuItem("前进--->");
	JMenuItem backitem = new JMenuItem("后退<---");
	JMenuItem fullscreenitem = new JMenuItem("全屏(U)");
	JMenuItem sourceitem = new JMenuItem("源代码(C)");
	JMenuItem reloaditem = new JMenuItem("刷新(R)");
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
	//接下来是工具栏部分
	JToolBar toobar = new JToolBar();
	JButton saveasbtn = new JButton("另存为");
	JButton backbtn = new JButton("<---");
	JButton forwardbtn = new JButton("--->");
	JButton sourcebtn = new JButton("源代码");
	JButton exitbtn = new JButton("退出");
	toobar.add(saveasbtn);
	toobar.addSeparator();
	toobar.add(backbtn);
	toobar.addSeparator();
	toobar.add(forwardbtn);
	toobar.addSeparator();
	toobar.add(sourcebtn);
	toobar.addSeparator();
	toobar.add(exitbtn);
	//滚轮
	JEditorPane editorpanel = new JEditorPane();
	JScrollPane scrollpanel = new JScrollPane(editorpanel);
	scrollpanel.setPreferredSize(new Dimension(100,630));
	//设置box
	Box address = Box.createHorizontalBox();
	JTextField jurl = new JTextField(60);
	JLabel addresslab = new JLabel("地址：");
	address.setPreferredSize(new Dimension(1000, 70));
	JButton cometobtn = new JButton("转到");
	address.add(addresslab);
	address.add(jurl);
	address.add(cometobtn);
	//整体布局
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
	//图标设置
	//ImageIcon icon = new ImageIcon("1.ico");
	//window.setIconImage(icon.getImage());
	//退出按钮，点击后退出当前窗口
	exititem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	//窗口关闭设置
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	}

}
