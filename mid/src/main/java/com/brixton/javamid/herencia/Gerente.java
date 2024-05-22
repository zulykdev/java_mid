package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Gerente extends Empleado {

    public boolean hasMBA;

    public Gerente(boolean tieneMBA) {
        setHasMBA(tieneMBA);

    }

}
