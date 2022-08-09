package sageAssessmentCenter;

class Main {
    public static void main(String[] args) {
        OpenPosition sageGraduateDev = new OpenPosition("Accounting",
                "healthy",
                "many",
                1);

        System.out.println("Recommendations to apply for a graduate role at Sage: "
                + sageGraduateDev.numberOfRecommendations);
        System.out.println("Sage product industry: "+ sageGraduateDev.industry);
        System.out.println("Sage corporate culture: " + sageGraduateDev.corporateCulture);
        System.out.println("Professional development opportunities at Sage: "
                + sageGraduateDev.professionalDevelopmentOpportunities);


        if (sageGraduateDev.industry == "Accounting"
                && sageGraduateDev.corporateCulture == "healthy"
                && sageGraduateDev.professionalDevelopmentOpportunities == "many") {
            System.out.println("What a perfect match for me!");
        }
        if (sageGraduateDev.numberOfRecommendations >= 1) {
            System.out.println("I should apply right now!");
        }

    }
    public static class OpenPosition {
        String industry;
        String corporateCulture;
        String professionalDevelopmentOpportunities;
        int numberOfRecommendations;

        public OpenPosition(String industry, String corporateCulture, String professionalDevelopmentOpportunities, int numberOfRecommendations) {
            this.industry = industry;
            this.corporateCulture = corporateCulture;
            this.professionalDevelopmentOpportunities = professionalDevelopmentOpportunities;
            this.numberOfRecommendations = numberOfRecommendations;

        }

    }
}