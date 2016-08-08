// ////////////////////////////////////////////
//
// test.java
// 
// 开发者:LoyaltyWu
// ////////////////////////////////////////////
// 简介：
//     数组应用例程————求解和为15的棋盘游戏问题
// 将1到9的九个数不重复地填入3X3的棋盘中,使得各行,各列
// 以及两条对角线上的3个数之和均为15
// ////////////////////////////////////////////
// 定义了一个test类
public class test 
{
	int [][] m_board;
	test(){
		m_board = new int [3][3];
	} // test 构造方法结束
	
	// 输出棋盘的格线行
	private void mb_outputGridRowBoard()
	{
		int i;
		System.out.print("+");
		for(i = 0;i<5;i++){
			System.out.print("-");
		}
		System.out.println("+");
	} // 方法 mb_outputGridRowBoard 结束 
	
	// 输出棋盘的数据行(第i行,i只能为0,1,2)
	private void mb_outputGridRowBoard(int i)
	{
		int j;
		for (j = 0;j<m_board[i].length;j++){
			System.out.print("|" + m_board[i][j]);
		}
		System.out.println("|");
	} // 方法 mb_outputGridRowBoard 结束
	
	// 输出棋盘
	public void mb_outputGrid()
	{
		int i;
		mb_outputGridRowBoard();
		for(i=0;i<m_board.length;i++){
			mb_outputGridRowBoard(i);
			mb_outputGridRowBoard();
		} // for 循环结束
	} // 方法 mb_outputGridRowBoard 结束
	
	// 初始化数据
	private void mb_dataInit()
	{
		int i,j,k;
		for (i = 0,k=1;i<m_board.length;i++){
			for (j = 0;j<m_board[i].length;j++,k++){
				m_board[i][j]=k;
			}
		}
	} // 方法 mb_dataInit 结束
	
	// 数据检测结束
	// 返回值说明:当数据为最后一个数据时,返回true;否则返回false
	private boolean mb_dataEnd()
	{
		int i,j,k;
		for (i=0,k=9;i<m_board.length;i++){
			for (j=0;j<m_board[i].length;j++,k--){
				if(m_board[i][j]!=k){
					return false;
				}
			}
		}
		return true;
	} // 方法 mb_dataEnd 结束
	
	// 取下一个数据
	private void mb_dataNext()
	{
		int i,j;
		for (i = m_board.length-1;i>=0;i--){
			for (j=m_board[i].length-1;j>=0;j--){
				if (m_board[i][j]==9){
					m_board[i][j] = 1;
				}
				else {
					m_board[i][j]++;
					return;
				}
			}
		}
	} // 方法mb_dataNext 结束
	// 方法mb_dataNext 模拟了那个计数器那种动作从末位开始加,若末位到9则重新归1,继续下一位.一旦下一位不用进位则return
	
	// 数据检测
	// 判断数中是否存在相同数字
	private boolean mb_dataCheckDifferent()
	{
		int i,j;
		int [] digit = new int [10];
		for (i = 0;i<m_board.length;i++){
			for (j=0;j<m_board[i].length;j++){
				digit[m_board[i][j]] = 1;
			}
		}
		for(i=1,j=0;i<digit.length;i++){
			j+=digit[i];
		}
		if (j==9){
			return true;
		}
		return false;
	}
	
	// 各行和是否为15
	private boolean mb_dataCheckSumRow()
	{
		int i,j,k;
		for (i = 0;i < m_board.length;i++){
			for (j = 0,k=0;j<m_board[i].length;j++){
				k += m_board[i][j];
			}
			if (k!=15){
				return false;//不用清0,每次2层循环重新初始化为0
			}
		}
		return true;
	}
	
	// 各列和是否为15
	private boolean mb_dataCheckSumColumn()
	{
		int i,j,k;
		for (i = 0;i<m_board.length;i++){
			for (j = 0,k=0;j<m_board[i].length;j++){
				k+=m_board[j][i];
			}
			if (k!=15){
				return false;//不用清0,每次2层循环重新初始化为0//不用清0,每次2层循环重新初始化为0
			}
		}
		return true;
	} // 方法 mb_dataCheckColumn 结束
	
	// 各对角线和是否为15
	private boolean mb_dataCheck()
	{
		return true;
	} // 方法 mb_dataCheck 结束
	
	
	// 求解并输出棋盘问题
	public void mb_arrange(){
		int n = 1;
		for (mb_dataInit();!mb_dataEnd();mb_dataNext()){
			if (mb_dataCheck()){
				System.out.println("第"+n+"个结果:");
				n++;
				mb_outputGrid();
			}
		}
	} // 方法 mb_arrange 结束
	
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//注意到此函数是println,也就是print a line 
		test a = new test();
		a.mb_arrange();
		//System.out.print("(o゜▽゜)o☆[BINGO!]");																			//用print就不会换行了
	} // 方法 main 结束
} //类 test 结束