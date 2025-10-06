class Solution {
    public int candy(int[] ratings) {
        int sum=1,i=1,n=ratings.length;
        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                sum=sum+1;
                i++;
                continue;
            }
            int peek=1; 
            while(i<n && ratings[i]>ratings[i-1])
            {
                peek++;
                sum=sum+peek;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1])
            {
                sum=sum+down;
                down++;
                i++;
            }
            if(down>peek)
            sum+=down-peek;
        }
        return sum;
    }
}