
public aspect LogAspect {
	 pointcut success() : call(* accion*(..));
	    after() : success() {  
	    	String nombreMetodo=thisJoinPoint.getSignature().getName();
	    	if (nombreMetodo.equals("accionBoton1")) {
	    		System.out.println("ASPECT AMARILLO"+"\n");
	    	}else if (nombreMetodo.equals("accionBoton2")) {
	    		System.out.println("ASPECT AZUL"+"\n");
	    	}else if (nombreMetodo.equals("accionBoton3")) {
	    		System.out.println("ASPECT ROJO"+"\n");
	    	}
	    }
	  
	    pointcut success1() : call(* removerLibro*());
	    after() returning(String nombre) :success1(){
	    	System.out.println("ASPECT LIBRO" + "\n");
	    	
	        System.out.println("Se ha comprado el libro: "+nombre.toString()); 

	    }

}
