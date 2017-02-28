package jetbrains.jetpad.samples.todo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface TodoBundle extends ClientBundle {
    TodoBundle INSTANCE = GWT.create(jetbrains.jetpad.samples.todo.TodoBundle.class);

    @CssResource.NotStrict
    @Source({
            "jetbrains/jetpad/samples/todo/resources/base.gss",
            "jetbrains/jetpad/samples/todo/resources/todo.gss"
    })
    CssResource styles();
}


