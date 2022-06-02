#include<stdio.h>

int main(){
  int a[2][2], b[2][2], c[2][2], i, j;
  int mat1, mat2, mat3, mat4 , mat5, mat6, mat7;

  printf("++++++++++++++++++++++++++++++++++++\n");
  printf("STRASSEN'S MULTIPLICATION PROGRAM\n");
  printf("++++++++++++++++++++++++++++++++++++\n");
  printf("\n");


  printf(">> ENTER THE 4-ELEMENTS OF FIRST MATRIX: \n");
  for(i = 0;i < 2; i++)
      for(j = 0;j < 2; j++)
           scanf("%d", &a[i][j]);
 
  printf(">> ENTER THE 4-ELEMENTS OF SECOND MATRIX: \n");
  for(i = 0; i < 2; i++)
      for(j = 0;j < 2; j++)
           scanf("%d", &b[i][j]);
 
  printf("\n>> THE FIRST MATRIX IS: \n");
  for(i = 0; i < 2; i++){
      printf("\n");
      for(j = 0; j < 2; j++)
           printf("%d\t", a[i][j]);
  }
 
  printf("\n>> THE SECOND MATRIX IS: \n");
  for(i = 0;i < 2; i++){
      printf("\n");
      for(j = 0;j < 2; j++)
           printf("%d\t", b[i][j]);
  }
 
  mat1= (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
  mat2= (a[1][0] + a[1][1]) * b[0][0];
  mat3= a[0][0] * (b[0][1] - b[1][1]);
  mat4= a[1][1] * (b[1][0] - b[0][0]);
  mat5= (a[0][0] + a[0][1]) * b[1][1];
  mat6= (a[1][0] - a[0][0]) * (b[0][0]+b[0][1]);
  mat7= (a[0][1] - a[1][1]) * (b[1][0]+b[1][1]);
 
  c[0][0] = mat1 + mat4- mat5 + mat7;
  c[0][1] = mat3 + mat5;
  c[1][0] = mat2 + mat4;
  c[1][1] = mat1 - mat2 + mat3 + mat6;
 
   printf("\n>> FINAL MATRIX AFTER MULTIPLICATION USING STRASSEN'S ALGORITHM\n");
   for(i = 0; i < 2 ; i++){
      printf("\n");
      for(j = 0;j < 2; j++)
           printf("%d\t", c[i][j]);
   }
 
   return 0;
}