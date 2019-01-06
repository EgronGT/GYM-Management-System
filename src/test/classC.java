
package test;


public class classC {
    
    private final String[] arrID;
    private final String[] arrHeight;
    private final String[] arrName;
    private final String[] arrSurname;
    private final String[] arrService;
    private final String[] arrType;
    private final String[] arrGender;             
    int nElems;           
    
    public classC(int max){
        arrID = new String[max];
        arrHeight = new String[max];
        arrName = new String[max];
        arrSurname = new String[max];
        arrService = new String[max];
        arrType = new String[max];
        arrGender = new String[max];
        
        nElems = 0; 
    }

    classC() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean find(String id){
        int j;
        for(j=0; j<nElems; j++) 
            if(arrID[j] == id)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }
    
    public void insert(String id, String height, String name,
            String surname,String service, String type, String gender, String price ){
        arrID[nElems] = id;
        arrHeight[nElems] = height;
        arrName[nElems] = name;
        arrSurname[nElems] = surname;
        arrService[nElems] = service;
        arrType[nElems] = type;
        arrGender[nElems] = gender;
      
        nElems++;
    }
    
    public boolean delete(String id){
        int j; for(j=0; j<nElems; j++)                               
            if( id == arrID[j] ) break; if(j==nElems)                
                return false; 
            else{ 
                for(int k=j; k<nElems; k++){
                    arrID[k] = arrID[k+1]; 
                    arrHeight[k] = arrHeight[k+1];
                    arrName[k] = arrName[k+1];
                    arrSurname[k] = arrSurname[k+1];
                    arrService[k] = arrService[k+1];
                    arrType[k] = arrType[k+1];
                    arrGender [k] = arrGender[k+1];
                }
                    nElems--;                      
                    return true; 
            } 
    }
    
}
