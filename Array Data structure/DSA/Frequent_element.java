public class Frequent_element {
    public static void main(String args[]){
        int arr[]={1,1,22,2,2,3,2,4,5};
        int most_frequent_element=arr[0];
        int m_count=0;
        for (int num:arr){
            int c_count=0;
            for (int val:arr){
                if (num==val){
                    c_count++;
                }
            }
            if(c_count>m_count){
                m_count=c_count;
                most_frequent_element=num;
            }

            
        }
        System.out.printf("The most frequent element is %d",most_frequent_element);
    }
}
