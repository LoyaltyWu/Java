// ////////////////////////////////////////////
//
// test.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
//     ����Ӧ�����̡�����������Ϊ15��������Ϸ����
// ��1��9�ľŸ������ظ�������3X3��������,ʹ�ø���,����
// �Լ������Խ����ϵ�3����֮�;�Ϊ15
// ////////////////////////////////////////////
// ������һ��test��
public class test 
{
	int [][] m_board;
	test(){
		m_board = new int [3][3];
	} // test ���췽������
	
	// ������̵ĸ�����
	private void mb_outputGridRowBoard()
	{
		int i;
		System.out.print("+");
		for(i = 0;i<5;i++){
			System.out.print("-");
		}
		System.out.println("+");
	} // ���� mb_outputGridRowBoard ���� 
	
	// ������̵�������(��i��,iֻ��Ϊ0,1,2)
	private void mb_outputGridRowBoard(int i)
	{
		int j;
		for (j = 0;j<m_board[i].length;j++){
			System.out.print("|" + m_board[i][j]);
		}
		System.out.println("|");
	} // ���� mb_outputGridRowBoard ����
	
	// �������
	public void mb_outputGrid()
	{
		int i;
		mb_outputGridRowBoard();
		for(i=0;i<m_board.length;i++){
			mb_outputGridRowBoard(i);
			mb_outputGridRowBoard();
		} // for ѭ������
	} // ���� mb_outputGridRowBoard ����
	
	// ��ʼ������
	private void mb_dataInit()
	{
		int i,j,k;
		for (i = 0,k=1;i<m_board.length;i++){
			for (j = 0;j<m_board[i].length;j++,k++){
				m_board[i][j]=k;
			}
		}
	} // ���� mb_dataInit ����
	
	// ���ݼ�����
	// ����ֵ˵��:������Ϊ���һ������ʱ,����true;���򷵻�false
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
	} // ���� mb_dataEnd ����
	
	// ȡ��һ������
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
	} // ����mb_dataNext ����
	// ����mb_dataNext ģ�����Ǹ����������ֶ�����ĩλ��ʼ��,��ĩλ��9�����¹�1,������һλ.һ����һλ���ý�λ��return
	
	// ���ݼ��
	// �ж������Ƿ������ͬ����
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
	
	// ���к��Ƿ�Ϊ15
	private boolean mb_dataCheckSumRow()
	{
		int i,j,k;
		for (i = 0;i < m_board.length;i++){
			for (j = 0,k=0;j<m_board[i].length;j++){
				k += m_board[i][j];
			}
			if (k!=15){
				return false;//������0,ÿ��2��ѭ�����³�ʼ��Ϊ0
			}
		}
		return true;
	}
	
	// ���к��Ƿ�Ϊ15
	private boolean mb_dataCheckSumColumn()
	{
		int i,j,k;
		for (i = 0;i<m_board.length;i++){
			for (j = 0,k=0;j<m_board[i].length;j++){
				k+=m_board[j][i];
			}
			if (k!=15){
				return false;//������0,ÿ��2��ѭ�����³�ʼ��Ϊ0//������0,ÿ��2��ѭ�����³�ʼ��Ϊ0
			}
		}
		return true;
	} // ���� mb_dataCheckColumn ����
	
	// ���Խ��ߺ��Ƿ�Ϊ15
	private boolean mb_dataCheck()
	{
		return true;
	} // ���� mb_dataCheck ����
	
	
	// ��Ⲣ�����������
	public void mb_arrange(){
		int n = 1;
		for (mb_dataInit();!mb_dataEnd();mb_dataNext()){
			if (mb_dataCheck()){
				System.out.println("��"+n+"�����:");
				n++;
				mb_outputGrid();
			}
		}
	} // ���� mb_arrange ����
	
	
	public static void main (String args[])
	{
		System.out.println("Java,Hello!");																					//ע�⵽�˺�����println,Ҳ����print a line 
		test a = new test();
		a.mb_arrange();
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� test ����