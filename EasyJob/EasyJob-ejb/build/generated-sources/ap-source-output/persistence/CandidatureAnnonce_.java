package persistence;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistence.Annonce;
import persistence.Candidat;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-09T18:50:38")
@StaticMetamodel(CandidatureAnnonce.class)
public class CandidatureAnnonce_ { 

    public static volatile SingularAttribute<CandidatureAnnonce, Long> id;
    public static volatile SingularAttribute<CandidatureAnnonce, String> lettre;
    public static volatile SingularAttribute<CandidatureAnnonce, Candidat> candidat;
    public static volatile SingularAttribute<CandidatureAnnonce, Annonce> annonce;
    public static volatile SingularAttribute<CandidatureAnnonce, String> cv;

}