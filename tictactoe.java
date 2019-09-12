import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;  
  
 class tictactoe extends JFrame implements ActionListener 
 {  

	JFrame f; 
	 //b[row][column] 
	JButton b[][]=new JButton[3][3];
	JButton src = new JButton();

	Font font;
	tictactoe()
	{
		f=new JFrame(); 

    	//b[row][column] 
      
    	for(int i=0;i<3;i++)
    	{
    	    for(int j=0;j<3;j++)
    	    {
    	        b[i][j] = new JButton();
    	        f.add(b[i][j]);
    	        b[i][j].setText(" ");
    	        
    	        if((j+1)%2==0 && (i+1)%2==0) 
    	            b[i][j].setBackground(Color.gray);
    	        else if((j+1)%2!=0 && (i+1)%2!=0)
    	            b[i][j].setBackground(Color.gray);
    	        else
    	            b[i][j].setBackground(Color.white);
    	        
    	        b[i][j].addActionListener(this);
	
        	}

    	}  
  
    	f.setLayout(new GridLayout(3,3));  
    	//setting grid layout of 8 rows and 8 columns  
    	
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	f.setSize(500,500);  
    	f.setVisible(true);
    	f.setResizable(false);

    	font = new Font ("Courier",Font.BOLD,100);
    }


	public static void main(String[] args)
	{  
   		 new tictactoe();  
	}  


	int cnt=0;

	public void actionPerformed(ActionEvent e)
	{
		//f.setDefaultCloseOperation(popup());
    	
		//if((int) e.getKeyCode()==27){restart();}
		if(e.getSource() instanceof JButton)
			src = (JButton)e.getSource();
		
		if(cnt%2!=0)
		{
			src.setText("o");
			src.setFont(font);
			
		}
		if(cnt%2==0)
		{
			src.setText("x");
			src.setFont(font);
			
		}
		cnt++;
		int input=2;
				
		if(b[0][0].getText()==b[1][1].getText()&&b[0][0].getText()==b[2][2].getText()&&b[0][0].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[0][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[0][0].getText()==b[0][1].getText()&&b[0][2].getText()==b[0][0].getText()&&b[0][0].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[0][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[0][0].getText()==b[1][0].getText()&&b[2][0].getText()==b[0][0].getText()&&b[0][0].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[0][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[1][0].getText()==b[1][1].getText()&&b[1][2].getText()==b[1][0].getText()&&b[1][0].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[1][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[0][1].getText()==b[1][1].getText()&&b[2][1].getText()==b[1][1].getText()&&b[1][1].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[0][1].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		if(b[2][2].getText()==b[1][2].getText()&&b[2][2].getText()==b[0][2].getText()&&b[0][2].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[0][2].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[2][2].getText()==b[2][1].getText()&&b[2][2].getText()==b[2][0].getText()&&b[2][0].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[2][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(b[2][0].getText()==b[1][1].getText()&&b[1][1].getText()==b[0][2].getText()&&b[0][2].getText()!=" ")
		{
			input = JOptionPane.showConfirmDialog(f, b[2][0].getText()+" won \n want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		else if(cnt==9)
		{
			input = JOptionPane.showConfirmDialog(f,"draw\n want to restart ?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			//input = 2;
		}
		
	}
	public void restart()
	{
		new tictactoe();
	}
		
}