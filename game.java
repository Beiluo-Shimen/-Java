package 俄罗斯方块;
import java.awt.*;
import javax.swing.*;

public class game extends JFrame{
	//行列数
	private static final int game_x=20;
	private static final int game_y=12;
	//文本域数组
	JTextArea[][] text;
	//二维数组
	int[][] data;
	public void initWindow(){
		this.setSize(600,750);//大小
		this.setVisible(true);//窗口可见
		this.setLocationRelativeTo(null);//窗口居中
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//释放窗体
		this.setResizable(false);//窗口大小不变
		this.setTitle("俄罗斯方块");//标题
	}
	//初始化
	public void initGamePanel() {
		JPanel game_main=new JPanel();
		game_main.setLayout(new GridLayout(game_x,game_y,1,1));
		//hgap:1,vgap:1为水平间距和上下
		//初始化面板
	/*	for(int i=0;i<text.length;i++) {
			for(int j=0;i<text[i].length;j++) {
				//文本域的行列数
				text[i][j]=new JTextArea(game_x,game_y);
				//设置文本域的背景颜色
				text[i][j].setBackground(Color.WHITE);
				//监听键盘事件
				text[i][j].addKeyListener(this);
				//初始化游戏边界
				if(j==0||j==text[i].length-1||i==text.length-1)
				{
					text[i][j].setBackground(Color.DARK_GRAY);
					data[i][j]=1;
				}
				//设置文本域不可编辑
				text[i][j].setEditable(false);
				//文本域添加到主面板
				game_main.add(text[i][j]);
				
			}
		}
		//添加到窗口
		this.setLayout(new BorderLayout());
		this.add(game_main,BorderLayout.CENTER);*/
	}
	public game() {
		text =new JTextArea[game_x][game_y];
		data=new int [game_x][game_y];
		initGamePanel();
		initWindow();
	}
	public static void main(String arges[]) {
		game a=new game();
	}

}
