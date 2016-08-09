// ////////////////////////////////////////////
//
// J_Grid15_OneVersion_OneVersion.java
// 
// ������:LoyaltyWu
// ////////////////////////////////////////////
// ��飺
//     ����Ӧ�����̡�����������Ϊ15��������Ϸ����
// ��1��9�ľŸ������ظ�������3X3��������,ʹ�ø���,����
// �Լ������Խ����ϵ�3����֮�;�Ϊ15
// һάVersion [i][j] into [i*3+j]
// ////////////////////////////////////////////
// ������һ��J_Grid15_OneVersion��
public class J_Grid15_OneVersion 
{
	int [] m_board;
	J_Grid15_OneVersion(){
		m_board = new int [9];
	} // J_Grid15_OneVersion ���췽������
	
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
		for (j = i*3;j<(i*3+3);j++){
			System.out.print("|" + m_board[j]);
		}
		System.out.println("|");
	} // ���� mb_outputGridRowBoard ����
	
	// �������
	public void mb_outputGrid()
	{
		int i;
		mb_outputGridRowBoard();
		for(i=0;i<3;i++){
			mb_outputGridRowBoard(i);
			mb_outputGridRowBoard();
		} // for ѭ������
	} // ���� mb_outputGridRowBoard ����
	
	// ��ʼ������
	private void mb_dataInit()
	{
		int i,j,k;
		for (i = 0,k=1;i<3;i++){
			for (j = 0;j<3;j++,k++){
				m_board[i*3+j]=k;
			}
		}
	} // ���� mb_dataInit ����
	
	// ���ݼ�����
	// ����ֵ˵��:������Ϊ���һ������ʱ,����true;���򷵻�false
	private boolean mb_dataEnd()
	{
		int i,j,k;
		for (i=0,k=9;i<3;i++){
			for (j=0;j<3;j++,k--){
				if(m_board[i*3+j]!=k){
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
		for (i = 2;i>=0;i--){
			for (j=2;j>=0;j--){
				if (m_board[i*3+j]==9){
					m_board[i*3+j] = 1;
				}
				else {
					m_board[i*3+j]++;
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
		for (i = 0;i<3;i++){
			for (j=0;j<3;j++){
				digit[m_board[i*3+j]] = 1;
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
		for (i = 0;i < 3;i++){
			for (j = 0,k=0;j<3;j++){
				k += m_board[i*3+j];
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
		for (i = 0;i<3;i++){
			for (j = 0,k=0;j<3;j++){
				k+=m_board[j*3+i];
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
		if (!mb_dataCheckSumColumn()){
			return false;
		}
		if (!mb_dataCheckSumRow()){
			return false;
		}
		if (!mb_dataCheckDifferent()){
			return false;
		}
		if ((m_board[0]+m_board[4]+m_board[8])!=15){
			return false;
		}
		if ((m_board[2]+m_board[4]+m_board[6])!=15){
			return false;
		}
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
		J_Grid15_OneVersion a = new J_Grid15_OneVersion();
		a.mb_arrange();
		//System.out.print("(o�b���b)o��[BINGO!]");																			//��print�Ͳ��ỻ����
	} // ���� main ����
} //�� J_Grid15_OneVersion ����