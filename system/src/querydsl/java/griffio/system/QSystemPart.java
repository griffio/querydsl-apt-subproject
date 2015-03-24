package griffio.system;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSystemPart is a Querydsl query type for SystemPart
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QSystemPart extends EntityPathBase<SystemPart> {

    private static final long serialVersionUID = 1141494871L;

    public static final QSystemPart systemPart = new QSystemPart("systemPart");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QSystemPart(String variable) {
        super(SystemPart.class, forVariable(variable));
    }

    public QSystemPart(Path<? extends SystemPart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemPart(PathMetadata<?> metadata) {
        super(SystemPart.class, metadata);
    }

}

