package suprisetest;

import java.util.Random;

public class DiagonalPattern {
	 public static void main(String[] args) {
	        int n=3;
	        Random random=new Random();
	        int grid[][]=new int[n][n];
	        
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                grid[i][j]=random.nextInt(100);
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(grid[i][j]+" ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("\nOutput");
	        
	        for(int i=0;i<=n+1;i++){
	            traverseColumn(grid,i);
	        }
	    }
	    
	    private static void traverseColumn(int grid[][],int target){
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[0].length;j++){
	                if(i+j==target){
	                System.out.print(grid[j][i]+" ");    
	                }
	            }
	        }
	        System.out.println();
	    }
	}