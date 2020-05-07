#include<iostream>
using namespace std;
int main()
{
  int unit, bill;
  int res;
  std::cin>>unit>>bill;
  
  if(unit<=200)
  {
    res = unit*0.5;
    std::cout<<"Rs."<<res;
  }
  else if(unit<=400 && unit>200)
  {
    res = unit*0.65 + 100;
    std::cout<<"Rs."<<res;
  }
  else if(unit<=600 && unit>400)
  {
    res = unit*0.80+200;
    std::cout<<"Rs."<<res;
  }
  else
  {
    res = unit*1.25+425;
    std::cout<<"Rs."<<res;
  }
}