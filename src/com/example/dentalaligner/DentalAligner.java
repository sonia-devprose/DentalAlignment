package com.example.dentalaligner;
// Base class representing general dental condition
class DentalCondition
{
    protected String patientName;
    protected String conditionType;
    protected int severityLevel;

    // constructor
    public DentalCondition(String patientName, String conditionType, int severityLevel)
    {
        this.patientName = patientName;
        this.conditionType = conditionType;
        this.severityLevel = severityLevel;
    }
    // Getter methods for each attribute
    public String getPatientName()
    {
        return patientName;
    }

    public String getConditionType()
    {
        return conditionType;
    }

    public int getSeverityLevel()
    {
        return severityLevel;
    }
    // Method to be overridden by sub-classes
    public String detectCondition()
    {
        return "Condition not specified";
    }
    // Method to generate a treatment plan - this too can be overridden
    public void generateTreatmentPlan()
    {

        System.out.println(patientName + " has a dental condition of " + conditionType + " with severity level of " + severityLevel + " and can get treatment options.");
    }


}

class OverbiteCondition extends DentalCondition {
    protected int overbiteMeasure;

    OverbiteCondition(String patientName, int severityLevel) {
        super(patientName, "Overbite", severityLevel);
        //this.overbiteMeasure = overbiteMeasure;
    }

    @Override
    public String detectCondition() {
        if (severityLevel < 5) {
            return "Normal bite";
        } else if (severityLevel <= 20) {
            return "Mild overbite";

        } else if (severityLevel <= 50) {
            return "Moderate overbite";
        } else {
            return "Severe overbite";
        }
    }

    @Override
    public void generateTreatmentPlan() {
        String severity = detectCondition();
        System.out.println(patientName + " - an overbite condition; " + severity);
        switch (severity) {
            case "Normal bite":
                System.out.println("No treatment plan required");
                break;

            case "Mild overbite":
                System.out.println("Invisalign aligners recommended");
                break;

            case "Moderate overbite":
                System.out.println("Invisalign with retainers and OPR recommended");
                break;

            default:
                System.out.println("Braces with tooth extraction required.");

        }
    }
}
        class UnderbiteCondition extends DentalCondition {
            UnderbiteCondition(String patientName, int severityLevel) {
                super(patientName, "Underbite", severityLevel);
                //this.overbiteMeasure = overbiteMeasure;
            }

            @Override
            public String detectCondition() {
                if (severityLevel < 5) {
                    return "Normal bite";
                } else if (severityLevel <= 20) {
                    return "Mild underbite";

                } else if (severityLevel <= 50) {
                    return "Moderate underbite";
                } else {
                    return "Severe underbite";
                }
            }

            @Override
            public void generateTreatmentPlan() {
                String severity = detectCondition();
                System.out.println(patientName + " - an underbite condition; " + severity);
                switch (severity) {
                    case "Normal bite":
                        System.out.println("No treatment plan required");
                        break;

                    case "Mild underbite":
                        System.out.println("Invisalign aligners recommended");
                        break;

                    case "Moderate underbite":
                        System.out.println("Invisalign with retainers and OPR recommended");
                        break;

                    default:
                        System.out.println("Braces with tooth extraction required.");

                }
            }

        }



public class DentalAligner {

    public static void main(String[] args)
    {
        DentalCondition case1 = new OverbiteCondition("John Doe", 10);
        DentalCondition case2 = new UnderbiteCondition("Tiffany", 45);
        DentalCondition case3 = new OverbiteCondition( "Stuart", 60);

        case1.generateTreatmentPlan();
        case2.generateTreatmentPlan();
        case3.generateTreatmentPlan();
    }
}
