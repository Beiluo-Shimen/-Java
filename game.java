package ����˹����;
import java.awt.*;
import javax.swing.*;

public class game extends JFrame{
	//������
	private static final int game_x=20;
	private static final int game_y=12;
	//�ı�������
	JTextArea[][] text;
	//��ά����
	int[][] data;
	public void initWindow(){
		this.setSize(600,750);//��С
		this.setVisible(true);//���ڿɼ�
		this.setLocationRelativeTo(null);//���ھ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ͷŴ���
		this.setResizable(false);//���ڴ�С����
		this.setTitle("����˹����");//����
	}
	//��ʼ��
	public void initGamePanel() {
		JPanel game_main=new JPanel();
		game_main.setLayout(new GridLayout(game_x,game_y,1,1));
		//hgap:1,vgap:1Ϊˮƽ��������
		//��ʼ�����
	/*	for(int i=0;i<text.length;i++) {
			for(int j=0;i<text[i].length;j++) {
				//�ı����������
				text[i][j]=new JTextArea(game_x,game_y);
				//�����ı���ı�����ɫ
				text[i][j].setBackground(Color.WHITE);
				//���������¼�
				text[i][j].addKeyListener(this);
				//��ʼ����Ϸ�߽�
				if(j==0||j==text[i].length-1||i==text.length-1)
				{
					text[i][j].setBackground(Color.DARK_GRAY);
					data[i][j]=1;
				}
				//�����ı��򲻿ɱ༭
				text[i][j].setEditable(false);
				//�ı�����ӵ������
				game_main.add(text[i][j]);
				
			}
		}
		//��ӵ�����
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
