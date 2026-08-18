public class Frequent_element {
    public static void main(String args[]){
        int arr[]={1,2,3,3,4,5};
        int most_frequent_element=arr[0];
        int m_count=0;
        for (int num:arr){
            int c_count=0;
            for (int val:arr){
                if (num==val){
                    c_count++; }
                }
            if(c_count>m_count){
                m_count=c_count;
                most_frequent_element=num;
            }
        }
        if(m_count==1){
            System.out.println(-1);
        }
        else{System.out.printf("The most frequent element in the array is %d and it appears %d times",most_frequent_element,m_count);} }}
    