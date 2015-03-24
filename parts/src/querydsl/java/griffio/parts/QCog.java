package griffio.parts;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCog is a Querydsl query type for Cog
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCog extends EntityPathBase<Cog> {

    private static final long serialVersionUID = -96671837L;

    public static final QCog cog = new QCog("cog");

    public final griffio.system.QSystemPart _super = new griffio.system.QSystemPart(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QCog(String variable) {
        super(Cog.class, forVariable(variable));
    }

    public QCog(Path<? extends Cog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCog(PathMetadata<?> metadata) {
        super(Cog.class, metadata);
    }

}

