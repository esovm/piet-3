class Codel
{
	int size;
	String colorVal;
	String colorName;

	//					row, col
	int[] rightTop = 	{-1, -1};
	int[] bottomRight = 	{-1, -1};
	int[] leftBottom = 	{-1, -1};
	int[] topLeft = 		{-1, -1};
	
	int topRow;		int topLeftCol;		int topRightCol;
	int bottomRow; 	int bottomLeftCol;	int bottomRightCol;
	
	int[][] yesBoard = new int[30][30];
	
	Codel()
	{
		
	}

	Codel(int[] xy, String[][] board)
	{
		this.colorVal = board[xy[0]][xy[1]];
		this.colorName = codelIntoString(colorVal);
	}
	
	public void printCodel()
	{
		System.out.println("Codel size: " + this.size);
		System.out.println("Codel color value: " + this.colorVal);
		System.out.println("Codel color: " + this.colorName);
		System.out.println("Codel's right-most & up-most block is at " + this.rightTop[0] + ", " + this.rightTop[1]);
		System.out.println("Codel's bottom-most & right-most block is at " + this.bottomRight[0] + ", " + this.bottomRight[1]);
		System.out.println("Codel's left-most & bottom-most block is at " + this.leftBottom[0] + ", " + this.leftBottom[1]);
		System.out.println("Codel's top-most & left-most block is at " + this.topLeft[0] + ", " + this.topLeft[1]);

	}
	
	public void printYesBoard(int numR, int numC)
	{
		for(int i = 0; i < numR; i++)
		{
			for(int j = 0; j < numC; j++)
			{
				System.out.print("i = " + i + "\tj = " + j + "\t");
				System.out.print(this.yesBoard[numR][numC] + "\t\t");
			}
			System.out.println();
		}
	}
	
	public String codelIntoString(String val)
	{
		switch(val)
		{
			case "0": return "black";			case "1": return "white";
			case "10": return "light red";		case "11": return "red";			case "12": return "dark red";
			case "20": return "light yellow";	case "21": return "yellow"; 		case "22": return "dark yellow";
			case "30": return "light green";		case "31": return "green"; 		case "32": return "dark green";
			case "40": return "light cyan";		case "41": return "cyan";		case "42": return "dark cyan";
			case "50": return "light blue"; 		case "51": return "blue";		case "52": return "dark blue";
			case "60": return "light magenta";	case "61": return "magenta";		case "62": return "dark magenta";
		}

		return "white";

		// red -> yellow -> green -> cyan -> blue -> magenta
		//  11		  21       31      41      51         61

		// black / white
		//	     0       1

	}
}