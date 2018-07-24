
package Clases;

/**
 *
 * @author STALIN
 */
public class OfertaAcademica {
    int idOfertaAcademica;
    GradoParalelo idGradoParalelo;
    Materia idMateria;

    public OfertaAcademica() {
    }

    public OfertaAcademica(int idOfertaAcademica, GradoParalelo idGradoParalelo, Materia idMateria) {
        this.idOfertaAcademica = idOfertaAcademica;
        this.idGradoParalelo = idGradoParalelo;
        this.idMateria = idMateria;
    }

    public int getIdOfertaAcademica() {
        return idOfertaAcademica;
    }

    public void setIdOfertaAcademica(int idOfertaAcademica) {
        this.idOfertaAcademica = idOfertaAcademica;
    }

    public GradoParalelo getIdGradoParalelo() {
        return idGradoParalelo;
    }

    public void setIdGradoParalelo(GradoParalelo idGradoParalelo) {
        this.idGradoParalelo = idGradoParalelo;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    
        
}
