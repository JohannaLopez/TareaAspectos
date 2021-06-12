
public aspect LogAspect {
	 pointcut success() : call(* accion*(..));
	    after() : success() {  
	    	String nombreMetodo=thisJoinPoint.getSignature().getName();
	    	if (nombreMetodo.equals("accionBoton1")) {
	    		System.out.println("ASPECT AMARILLO");
	    	}else if (nombreMetodo.equals("accionBoton2")) {
	    		System.out.println("ASPECT AZUL");
	    	}else {
	    		System.out.println("ASPECT ROJO");
	    	}
	    }

}
