#include<iostream>
int main()
{
    int sun, mon, tue, wed, thu, fri, sat;
    std::cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
    
    int total_hours = sun+mon+tue+wed+thu+fri+sat;
    // std::cout<<"total hours: "<<total_hours<<std::endl;

    // variable for total working hours per day
    int working_hours = 8;

    // variable for weekend overtime
    int weekend_overtime = 0;
    int sunday_bonus = ((sun*100)/2);   // plus 50% of total
    int total_sunday_bonus = 0;
    int saturday_bonus = ((sat*100)/4); // plus 25% of total
    int total_saturday_bonus = 0;

    // variables for total_income (day-by-day)
    int sunday_income = 0;
    int monday_income = 0;
    int tuesday_income = 0;
    int wednesday_income = 0;
    int thursday_income = 0;
    int friday_income = 0;
    int saturday_income = 0;
    int total_income = 0;

    if(sun > 0){
      int overtime = 0;
        if(sun > working_hours){
            overtime = sun - working_hours;
            weekend_overtime = (sun*100) + (overtime * 15);
        }
        //std::cout<<"extra hours on sun: "<<overtime<<std::endl;
        total_sunday_bonus = (sun*100) + sunday_bonus;
        sunday_income = weekend_overtime + total_sunday_bonus;
        //std::cout<<"sun pay: "<<sunday_income<<std::endl;
    }

    if(mon > 0){
      int overtime = 0;
        if(mon > working_hours){
            overtime = mon - working_hours;
        }
        //std::cout<<"extra hours on mon: "<<overtime<<std::endl;
        monday_income = (mon*100) + (overtime * 15);
        //std::cout<<"mon pay: "<<monday_income<<std::endl;
    }

    if(tue > 0){
      int overtime = 0;
        if(tue > working_hours){
            overtime = tue - working_hours;
        }
        //std::cout<<"extra hours on tue: "<<overtime<<std::endl;
        tuesday_income = (tue*100) + (overtime * 15);
        //std::cout<<"tue pay: "<<tuesday_income<<std::endl;
    }

    if(wed > 0){
      int overtime = 0;
        if(wed > working_hours){
            overtime = wed - working_hours;
        }
        //std::cout<<"extra hours on wed: "<<overtime<<std::endl;
        wednesday_income = (wed*100) + (overtime * 15);
        //std::cout<<"wed pay: "<<wednesday_income<<std::endl;
    }

    if(thu > 0){
      int overtime = 0;
        if(thu > working_hours){
            overtime = thu - working_hours;
        }
        //std::cout<<"extra hours on thu: "<<overtime<<std::endl;
        thursday_income = (thu*100) + (overtime * 15);
        //std::cout<<"thu pay: "<<thursday_income<<std::endl;
    }

    if(fri > 0){
      int overtime = 0;
        if(fri > working_hours){
            overtime = fri - working_hours;
        }
        //std::cout<<"extra hours on fri: "<<overtime<<std::endl;
        friday_income = (fri*100) + (overtime * 15);
        //std::cout<<"fri pay: "<<friday_income<<std::endl;
    }

    if(sat > 0){
      int overtime = 0;
        if(sat > working_hours){
            overtime = sat - working_hours;
            weekend_overtime = (sun*100) + (overtime * 15);
        }
        //std::cout<<"extra hours on sat: "<<overtime<<std::endl;
        total_saturday_bonus = (sat*100) + saturday_bonus;
        saturday_income = weekend_overtime + total_saturday_bonus;
        //std::cout<<"sat pay: "<<saturday_income<<std::endl;
    }

    // sum of total_income
    total_income = sunday_income + monday_income + tuesday_income + wednesday_income + thursday_income + friday_income + saturday_income;
    std::cout<<total_income<<std::endl;
}