package griffio.parts;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QGear is a Querydsl query type for Gear
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGear extends EntityPathBase<Gear> {

    private static final long serialVersionUID = 1298249831L;

    public static final QGear gear = new QGear("gear");

    public final griffio.system.QSystemPart _super = new griffio.system.QSystemPart(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QGear(String variable) {
        super(Gear.class, forVariable(variable));
    }

    public QGear(Path<? extends Gear> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGear(PathMetadata<?> metadata) {
        super(Gear.class, metadata);
    }

}

