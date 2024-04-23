import java.util.ArrayList;
public class StepTracker
{
 private int c, numDays, activeDays, totalSteps;
 public StepTracker(int a){
  c=a; 
  numDays = 0; 
  activeDays = 0;
  totalSteps =0;
 }
 public void addDailySteps(int steps){
  totalSteps+= steps;
  numDays++;
   if (steps>= c){
   activeDays++;
   }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  if (numDays==0){
   return 0.0;
  }
  return ((double)(totalSteps)/numDays);
 }
} 
