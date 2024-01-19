#include <stdio.h>
void main()
{
           int product = 1, count = 9;
              do{
                      --count;
                      product*=2;
                      printf("%d",product);
             }while( count > 9 );
}

