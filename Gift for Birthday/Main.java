#include<iostream>
using namespace std;
int main()
{
  int year;
  
  std::cin>>year;
  
  if(year % 4 == 0)
  {
    std::cout<<year<<" is a leap year";
  }
  else if(year % 100 == 0){
    std::cout<<year<<" is a leap year";
  }
  else if(year % 400 == 0){
    std::cout<<year<<" is a leap year";
  }
  else{
    std::cout<<year<<" is not a leap year";
  }
}