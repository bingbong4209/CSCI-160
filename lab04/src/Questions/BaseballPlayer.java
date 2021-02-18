/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class BaseballPlayer {
    
    String name = "Dante";
    int number = 1, singles = 1, doubles = 1, triples = 1, homeRuns = 1, atBats = 1, walks = 1, sacrificeFlies = 1;
    static DecimalFormat baseballFormat = new DecimalFormat("#.000");
    public BaseballPlayer(String name, int number, int singles, int doubles, int triples, int homeRuns, int atBats, int walks, int sacrificeFlies)
    {
        this.name = name;
        this.number = number;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.atBats = atBats;
        this.walks = walks;
        this.sacrificeFlies = sacrificeFlies;
    }
    
    public double getBattingAverage()
    {
        return ((double)(singles) + doubles + triples + homeRuns) / atBats;
    }
    
    public double getSluggingPercentage()
    {
        return ((double)(1*singles) + (2*doubles) + (3*triples) + (4*homeRuns)) / atBats;
    }
    
    public double getOnBasePercentage()
    {
        return ((double)singles + doubles + triples + homeRuns + walks) / (atBats + walks + sacrificeFlies);
    }
    
    public String getFormattedBattingAverage()
    {
        return baseballFormat.format(getBattingAverage());
    }
    
    public String getFormattedSluggingPercentage()
    {
        return baseballFormat.format(getSluggingPercentage());
    }
    
    public String getFormattedOnBasePercentage()
    {
        return baseballFormat.format(getOnBasePercentage());
    }
}
