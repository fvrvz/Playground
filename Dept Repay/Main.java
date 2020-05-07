#include<iostream>
using namespace std;
int main()
{
  int borrowedMoney, rate, time;
  
  std::cin>>borrowedMoney;
  std::cin>>rate;
  std::cin>>time;
  
  float simpleInterest = borrowedMoney*rate*time/100;
  std::cout<<simpleInterest;
  
  float totalMoney = borrowedMoney + simpleInterest;
  std::cout<<"\n"<<totalMoney;
  
  float discountValue = simpleInterest * 2/100;  //3
  std::cout<<"\n"<<discountValue;
  
  float toPay = totalMoney - discountValue;
  std::cout<<"\n"<<toPay;
  
}