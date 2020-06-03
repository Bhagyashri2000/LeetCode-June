class Solution {
    public int twoCitySchedCost(int[][] costs) 
    {
        
        int[] diff=new int[costs.length];     //array contains difference between cost of flying to city-A and cost of flying to city-B
        char[] label=new char[costs.length];  //label (A/B), which city i'th person will fly
        
        
        
        for(int i=0;i<costs.length;i++)
        {
            
            diff[i]=costs[i][0]-costs[i][1];
            
        }
        
        int sum=0;        //cost 
        int cntb=0;       //count of people who fly to city-B
        int l=costs.length;
        while(l>0)
        {
            int max=-10000;
            int ind=0;
            for(int i=0;i<costs.length;i++)     //calculate maximum from diff array
            {
                if(diff[i]>max&&label[i]=='\0')
                {
                    max=diff[i];
                    ind=i;
                }
            }
            if(cntb<costs.length/2)
            {
                label[ind]='b';
                cntb++;
            }
            else
            {
                label[ind]='a';
            }
            l--;
            
        }
        for(int i=0;i<costs.length;i++)
        {
            System.out.println(label[i]);
            if(label[i]=='a')
            {
                sum=sum+costs[i][0];
            }
            else
            {
                sum=sum+costs[i][1];
            }
        }
        return sum;
        
    }
}
