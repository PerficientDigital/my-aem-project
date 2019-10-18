import React from 'react';
import { Page, withModel, EditorContext, Utils } from '@adobe/cq-react-editable-components'

class App extends Page {

    render() {
        return (
            <div className="App">
                    { this.childComponents }
                    { this.childPages }
            </div>
        );
    }
}

export default withModel(App);