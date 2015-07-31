/*
���ͣ�
���ȣ���Ϊ����2�Σ���һ�ε������Ժ͵ڶ��ε�����ͬһʱ�䣩�����ڶ��ε������ڵ�һ�ε�����ߡ�
����ά��2����f1��f2��size����pricesһ����
���壺
f1[i]��ʾ -- ��ֹ��i�±�Ϊֹ��������������ܹ��ﵽ���profit��
f2[i]��ʾ -- ��ֹ��i�±�Ϊֹ���ұ����������ܹ��ﵽ���profit��
��ô������f1 + f2��Ѱ����󼴿ɡ�
*/
public class Solution {
    public int maxProfit(int[] prices) {
    	if(prices.length == 0 || prices.length == 1){  
            return 0;  
        }            
        int max = 0;  
        int[] left = new int[prices.length]; 
        int[] right = new int[prices.length];
          
        left[0] = 0;  
        int min = prices[0];             
        for(int i=1; i<left.length; i++){  
            left[i] = Math.max(left[i-1], prices[i]-min); 
            min = Math.min(min, prices[i]);
        }  
          
        right[right.length-1] = 0;  
        max = prices[right.length-1];
        for(int i=right.length-2; i>=0; i--){  
            right[i] = Math.max(right[i+1], max-prices[i]); 
            max = Math.max(max, prices[i]); 
        }
        max = 0;    
        for(int i=0; i<prices.length; i++){  
            max = Math.max(max, left[i]+right[i]);  
        }  
          
        return max;          
    }
}