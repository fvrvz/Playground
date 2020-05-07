#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int total_balls, target, curr_score, balls_bowled;
  std::cin>>total_balls>>target>>curr_score>>balls_bowled;
  
  //total overs
  int total_overs = total_balls / 6;
  std::cout<<total_overs<<std::endl;
  
  //over finished
  double overs = 0;
  int temp = 0;

  overs=(balls_bowled/6);
  temp=balls_bowled%6;
  if(temp>0){
  double remainingBalls=temp*(0.10); 
  overs=overs+remainingBalls;
  std::cout<<overs<<std::endl;
  }
  else{
  std::cout<<(int)overs<<std::endl;
  }
  
  //current run rate
  float c_rr = curr_score / overs;
  std::cout<<std::fixed<<std::setprecision(1)<<c_rr<<std::endl;
  
  //total run rate
  float total_rr = float(target) / float(total_overs);
  std::cout<<std::fixed<<std::setprecision(1)<<total_rr;
  
  if(c_rr > total_rr){
    std::cout<<"\nEligible to Win";
  }
  else{
    std::cout<<"\nNot Eligible to Win";
  }
}