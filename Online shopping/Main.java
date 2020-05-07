#include<iostream>
using namespace std;
int main()
{
  int flipPrice, flipDis, flipCharges;
  int snapPrice, snapDis, snapCharges;
  int amazonPrice, amazonDis, amazonCharges;
  
  std::cin>>flipPrice>>flipDis>>flipCharges;
  std::cin>>snapPrice>>snapDis>>snapCharges;
  std::cin>>amazonPrice>>amazonDis>>amazonCharges;
  
  float flipDiscount = float(flipDis) / 100;
  float snapDiscount = float(snapDis) / 100;
  float amazonDiscount = float(amazonDis) / 100;
  
  int flipTotal = (flipPrice - (flipDiscount * flipPrice)) + flipCharges;
  int amazonTotal = (amazonPrice - (amazonDiscount * amazonPrice)) + amazonCharges;
  int snapTotal = (snapPrice - (snapDiscount * snapPrice)) + snapCharges;
  
  std::cout<<"In Flipkart Rs."<<flipTotal<<std::endl;
  std::cout<<"In Snapdeal Rs."<<snapTotal<<std::endl;
  std::cout<<"In Amazon Rs."<<amazonTotal<<std::endl;
  
  if(flipTotal <= amazonTotal && flipTotal <= snapTotal){
    std::cout<<"He will prefer Flipkart";
  }
  else if(amazonTotal < snapTotal){
    std::cout<<"He will prefer Amazon";
  }
  else{
    std::cout<<"He will prefer Snapdeal";
  }
}