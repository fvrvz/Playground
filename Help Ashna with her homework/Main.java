#include <iostream>
#define next_line '\n' //difining the \n as next_line
int main() {
  int a,b,res;
  //taking two operands by user
  std::cin>>a>>b;
  //operation for addition
  res = a + b;
  std::cout<<"a+b="<<res<<next_line;
  //operation for substraction
  res = a - b;
  std::cout<<"a-b="<<res<<next_line;
  //operation for multiplication
  res = a * b;
  std::cout<<"a*b="<<res<<next_line;
  //operation for division
  res = a / b;
  std::cout<<"a/b="<<res<<next_line;
  //operation for modulo
  res = a % b;
  std::cout<<"a%b="<<res<<next_line;
}