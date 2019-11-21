public class Wonder
{
    private String name;
    private int currentStage;
    private Resources product; //resource that the wonder produces
    
    public Wonder (String s) {
    	if (s.equals("Colossus of Rhodes")) {
    		name="rhodes";
    		currentStage=0;
    		product=new Resources("Ore");
    	}
    	if (s.equals("Halicarnassus")) {
    		name=s.toLowerCase();
    		currentStage=0;
    		product=new Resources("Loom");
    	}
    	if (s.equals("Lighthouse of Alexandria")) {
    		name="alexandria";
    		currentStage=0;
    		product=new Resources("Glass");
    	}
    	if (s.equals("Hanging Gardens of Babylon")) {
    		name="babylon";
    		currentStage=0;
    		product=new Resources("Clay");
    	}
    	if (s.equals("Ephesos")) {
    		name=s.toLowerCase();
    		currentStage=0;
    		product=new Resources("Papyrus");
    	}
    	if (s.equals("Great Pyramid of Giza")) {
    		name="giza";
    		currentStage=0;
    		product=new Resources("Stone");
    	}
    	if (s.equals("Statue of Zeus at Olympia")) {
    		name="olympia";
    		currentStage=0;
    		product=new Resources("Timber");
    	}
    }
    public static final String[] WONDERS = {
        "Colossus of Rhodes",
        "Halicarnassus",
        "Lighthouse of Alexandria",
        "Hanging Gardens of Babylon",
        "Great Pyramid of Giza",
        "Ephesos",
        "Statue of Zeus at Olympia"
    };
    public String wonderEffect(int stage)
    {
        if (stage == 1) return "VP 3";
        else if (stage == 3) return "VP 7";
        else //if Stage == 2
        {
            if (getName().equals("Colossus of Rhodes")) return "WP 2";
            else if (getName().equals("Halicarnassus")) return "drawDiscard"; //Draw from discard 
            else if (getName().equals("Lighthouse of Alexandria")) return "resourceAll"; //Resource of choice
            else if (getName().equals("Hanging Gardens of Babylon")) return "scienceAll"; //Provides science of choice
            else if (getName().equals("Great Pyramid of Giza")) return "VP 5";
            else if (getName().equals("Ephesos")) return "C 9";
            else //Olympia
                return "ignoreCost";
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getCurrentStage()
    {
        return currentStage;
    }
    public void setCurrentStage(int currentStage)
    {
        this.currentStage = currentStage;
    }
    public Resources getProduct()
    {
        return product;
    }
    public static String[] getWonders()
    {
        return WONDERS;
    }
    public void setProduct(Resources product)
    {
        this.product = product;
    }
}