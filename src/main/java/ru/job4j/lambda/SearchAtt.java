package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filter(
            List<Attachment> listAttachment, Predicate<Attachment> pred) {

        List<Attachment> rslt = new ArrayList<>();
        for (Attachment attachment : listAttachment) {
            if (pred.test(attachment)) {
                rslt.add(attachment);
            }
        }
        return rslt;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> pred = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        return filter(list, pred);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> pred = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        return filter(list, pred);
    }
}
