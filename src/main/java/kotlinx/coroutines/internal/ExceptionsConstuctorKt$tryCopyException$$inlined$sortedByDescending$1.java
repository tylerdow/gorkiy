package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 1, 16})
/* compiled from: Comparisons.kt */
public final class ExceptionsConstuctorKt$tryCopyException$$inlined$sortedByDescending$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Constructor constructor = (Constructor) t2;
        Intrinsics.checkExpressionValueIsNotNull(constructor, "it");
        Constructor constructor2 = (Constructor) t;
        Intrinsics.checkExpressionValueIsNotNull(constructor2, "it");
        return ComparisonsKt.compareValues(Integer.valueOf(constructor.getParameterTypes().length), Integer.valueOf(constructor2.getParameterTypes().length));
    }
}