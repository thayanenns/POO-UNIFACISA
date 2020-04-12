package q4;

public class JogoDaVelha {
	String aux = "";
	char[][] tabuleiro; 
	boolean vezJogador1;
	
	public JogoDaVelha() 
	{
		this.tabuleiro = new char[3][3];
		this.vezJogador1 = vezJogador1;
	    this.iniciarJogo();
	}
		
	public void iniciarJogo() 
	{
		this.tabuleiro = new char[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
	        {
				tabuleiro[i][j] = ' ';
	        }
		}
	}

	boolean jogar(int linha, int coluna) 
	{ 
		char simbolo;	
		if (vezJogador1) 
		{
			simbolo = 'X';
		} 
		else 
		{
			simbolo = 'O';
		}
		if (linha < 3 && linha >= 0) 
		{
			if(coluna < 3 && coluna >= 0) 
			{
				if(tabuleiro[linha][coluna] == ' ' && tabuleiro[linha][coluna] != simbolo ) 
				{
					tabuleiro[linha][coluna] = simbolo;
					aux="\n"+"  | "+tabuleiro[0][0]+" | "+tabuleiro[0][1]+" | "+tabuleiro[0][2]+" | "
		  		     +"\n"+"  | "+tabuleiro[1][0]+" | "+tabuleiro[1][1]+" | "+tabuleiro[1][2]+" | "
					 +"\n"+"  | "+tabuleiro[2][0]+" | "+tabuleiro[2][1]+" | "+tabuleiro[2][2]+" | "+"\n";
					if(simbolo == 'X') 
					{
						vezJogador1 = false;
						System.out.println("\n"+"VEZ -> JOGADOR 2");
					} 
					else
					{
						vezJogador1= true;
						System.out.println("\n"+"VEZ -> JOGADOR 1");
					}	
				}
				else 
					{
						System.out.println("Jogada indisponível, tente novamente!");
					}
						
			}
			System.out.println(aux);
			}
		return this.detectaFimJogo();
	}
	boolean detectaFimJogo() 
	{
		boolean fimJogo = false; 
		if(tabuleiro[0][0] != ' ')
		{	
			if(tabuleiro[0][1] == tabuleiro[0][0] && tabuleiro[0][2] == tabuleiro[0][0] ||
					tabuleiro[1][0] == tabuleiro[0][0] && tabuleiro[2][0] == tabuleiro[0][0] ||
		           tabuleiro[1][1] == tabuleiro[0][0] && tabuleiro[2][2] == tabuleiro[0][0]) 
			{
				fimJogo = true; 
		    }
		}
	    if(tabuleiro[0][1] != ' ')
	    {
		    if(tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][2] == tabuleiro[0][1] ||
		       tabuleiro[1][1] == tabuleiro[0][1] && tabuleiro[2][1] == tabuleiro[0][1])
		    {
		    	fimJogo = true; 
		    }
		}
	    	if(tabuleiro[0][2] != ' ')
		    {
	          if(tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0] == tabuleiro[0][2] ||
	              tabuleiro[1][2] == tabuleiro[0][2] && tabuleiro[2][2] == tabuleiro[0][2] ||		              
	              tabuleiro[1][1] == tabuleiro[0][2] && tabuleiro[2][0] == tabuleiro[0][2])
	          {
	        	  fimJogo = true; 
		      }
		   }
		       
	    	if(tabuleiro[1][0] != ' ')
		     {
		         if(tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[2][0] == tabuleiro[1][0] ||
		              tabuleiro[1][1] == tabuleiro[1][0] && tabuleiro[1][2] == tabuleiro[1][0])
		         {
		       	   fimJogo = true; 
		         }
		     }
		      if(tabuleiro[1][1] != ' ')
		       {
		           if(tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[2][1] == tabuleiro[1][1] ||
		              tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][2] == tabuleiro[1][1] ||
		              tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[2][2] == tabuleiro[1][1] ||
		              tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[1][1])
		           {
		        	   fimJogo = true; 
		           }
		       }
		       if(tabuleiro[1][2] != ' ')
		       {
		           if(tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[2][2] == tabuleiro[1][2] ||
		              tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[1][0] == tabuleiro[1][2])
		           {
		        	   fimJogo = true; 
		           }
		       }
		       
		       if(tabuleiro[2][0] != ' ')
		       {
		           if(tabuleiro[0][0] == tabuleiro[2][0] && tabuleiro[1][0] == tabuleiro[2][0] ||
		              tabuleiro[2][1] == tabuleiro[2][0] && tabuleiro[2][2] == tabuleiro[2][0] ||
		              tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] == tabuleiro[2][0])
		           {
		        	   fimJogo = true; 
		           }
		       }
		       if(tabuleiro[2][1] != ' ')
		       {
		           if(tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][2] == tabuleiro[2][1] ||
		              tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][1] == tabuleiro[2][1])
		           {
		        	   fimJogo = true; 
		           }
		       }
		       if(tabuleiro[2][2] != ' ')
		       {
		           if(tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[2][0] == tabuleiro[2][2] ||
		              tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][2] == tabuleiro[2][2]  ||
		              tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] == tabuleiro[2][2])
		           {
		        	   fimJogo = true; 
		           }
		       }
		       return fimJogo;
		    }
	}