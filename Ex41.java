
package ex41;


public class Ex41 {

    static void island(int a[][]){
        int r=a.length;
        int c=a[0].length;
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==1){
                    dfs(a,i,j);
                    res+=1;
                }
                
            }
        }
        System.out.println("total no. of island is  "+res);
    }
    
    static void dfs(int a[][],int r,int c){
        int m=a.length;
        int n=a[0].length;
        if(r<0||c<0||r>=m||c>=n||a[r][c]!=1){
            return;
        }
        a[r][c]=2;
        dfs(a,r+1,c);
         dfs(a,r-1,c);
          dfs(a,r,c+1);
         dfs(a,r,c-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World!");
        System.out.println("1 ->island\n 0-> water");
        int a[][]=new int[][]{{1,0,1,0},{1,0,0,1},{0,1,1,0},{1,1,1,1}};
        island(a);
    }
    
}
