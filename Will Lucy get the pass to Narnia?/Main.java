#include <iostream>
int main(){
  int num1, num2, op;
  
  std::cout<<"Enter first number : ";
  std::cin>>num1;
  
  std::cout<<"Enter second number : ";
  std::cin>>num2;
  
  std::cout<<"Menu";
  
  std::cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  std::cin>>op;
  
  switch(op){
    case 1:
      std::cout<<"\n"<<num1+num2;
      break;
    case 2:
      std::cout<<"\n"<<num1-num2;
      break;
    case 3:
      std::cout<<"\n"<<num1*num2;
      break;
    case 4:
      std::cout<<"\n"<<num1/num2;
      break;
    case 5:
      std::cout<<"\n"<<num1%num2;
      break;
    default:
      std::cout<<"\nInvalid operation";
      break;
  }
}